# customFramework

## Prerequisites

Test was run on Windows OS and Chrome version 53, Firefox version 49
(support for Linux and MacOs is added but was no tested there)
Java 1.8 and Maven 3 should be installed.

## Test run

To run test type in command line
```
mvn clean test -Dbrowser=chrome
```
there is two browsers support added to framework chrome and firefox
if you want to run test on firefox, use firefox browser parameter
```
-Dbrowser=firefox
```

## Report

To generate report we are using Allure Test Report plugin
after test run type in command line
```
mvn site
```
report will be generated in
```
target/site/allure-maven-plugin/index.html
```
screenshots are saved in target/screenshot/*
and are also attached in report for failed tests