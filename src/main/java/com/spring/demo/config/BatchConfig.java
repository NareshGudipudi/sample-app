package com.spring.demo.config;
 
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import com.spring.demo.model.AddressDTO;
import com.spring.demo.repo.AddressRepo;
 
@Configuration
@EnableBatchProcessing
public class BatchConfig {
     
	@Autowired
	AddressRepo repo;
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
 
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
 
    @Value("classPath:/input/inputData.csv")
    private Resource inputResource;
 
    @Bean
    public Job readCSVFileJob() {
        return jobBuilderFactory
                .get("readCSVFileJob")
                .incrementer(new RunIdIncrementer())
                .start(step())
                .build();
    }
 
    @Bean
    public Step step() {
        return stepBuilderFactory
                .get("step")
                .<AddressDTO, AddressDTO>chunk(5000)
                .reader(reader())
                .processor(processor())
                .writer(writer())
                .build();
    }
     
    @Bean
    public ItemProcessor<AddressDTO, AddressDTO> processor() {
        return new DBLogProcessor();
    }
    
    @Bean
    public DBWriter writer() {
        return new DBWriter();
    }
     
    @Bean
    public FlatFileItemReader<AddressDTO> reader() {
        FlatFileItemReader<AddressDTO> itemReader = new FlatFileItemReader<AddressDTO>();
        itemReader.setLineMapper(lineMapper());
        itemReader.setLinesToSkip(1);
        itemReader.setResource(inputResource);
        return itemReader;
    }
 
    @Bean
    public LineMapper<AddressDTO> lineMapper() {
        DefaultLineMapper<AddressDTO> lineMapper = new DefaultLineMapper<AddressDTO>();
        DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
        lineTokenizer.setNames(new String[] {"x","y","objectId","entryid","AddressDTOHn","AddressDTOPt","AddressDTOSn","AddressDTOPd","AddressDTOSt","AddressDTOSd","fullAddressDTO","subHm","aptUnit","resType","communityVar","zipcode","poName","state","countryName","stateId","fips","coorsys","pointX","pointY","usng","ddlat","ddlon","processId"});
        BeanWrapperFieldSetMapper<AddressDTO> fieldSetMapper = new BeanWrapperFieldSetMapper<AddressDTO>();
        fieldSetMapper.setTargetType(AddressDTO.class);
        lineMapper.setLineTokenizer(lineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);
        return lineMapper;
    }

}