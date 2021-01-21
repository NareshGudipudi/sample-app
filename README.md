# sample-app

In this application technologies used

java 8
springboot
Spring batch
jpa
H2DB
Rest

Steps to run application:
1. Checkout project and import to eclipse/sts/any ide

2. Download latest csv file from https://www.nconemap.gov/datasets/nc-master-address-dataset-2014?showData=true then add under input folder as inputData.csv

3. Run Application as java application after project build

4.The below API need to run in local before showing demo
  Postman collection added to under project dir .please import to postman app and run      apis


    http://localhost:8080/invokejob

    this will read data from csv and persist into H2DB 

5 .After u can run the below api line to get the corresponding adress from the Database layer

    http://localhost:8080/api/getAddress?address="write some ddress here"
    

Test ehcache functionality:

1. After Application is started, run the APIs:

	http://localhost:8080/invokejob
        http://localhost:8080/api/getAddress?address="write some ddress here"

   This will store the result of second API in ehcache. Console logs will indicate that. Now invoke the same API again. This time, instead of fetching resukt from database, result will be fetched from cache. Console logs will indicate the same and also postman request will be executed very quickly.

2. To evict/delete the cache, run the API:

   http://localhost:8080/api/evict-cache

   This evicts the cache and console logs indicate the same.


Run app in cloud using Docker 
1.Docker file is created and under project dir.
 commands to build and run once Docker setup is done in local

      docker build . -t sample-app
      docker run -d  -p 8080:8080 --name sample-app  sample-app:latest
      application will start running on 8080
      you can access localhost:8080
      
      
      
To access H2 Db use the below URL
    http://localhost:8080/h2-console/login.do?jsessionid=c129e8ada497ffd355d4cd8e3e5c796c
login credentials not required
  mysql properties also added you can setup and enbale mysql props in    application.properties





