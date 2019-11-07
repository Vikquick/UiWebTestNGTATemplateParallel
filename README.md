# UiWebTestNGTATemplateParallel
## Базовый проект для праллельного UI Web тестирования (JAVA 1.8)
### Фреймворки:
1) TestNG
2) Allure
3) Selenide
4) Selenoid

### Параллелизация
1) Набор TestSuites описан в testng.xml, выполняются последовательно
2) Каждый TestSute описан в соответствующем sute{BROWSER_NAME}.xml файле,
 классы тестов (Features) выполняются параллельно, количество потоков зависит
 от переменной thread-count

### Установка Selenoid
```
curl -s https://aerokube.com/cm/bash | bash
chmod +x ./cm

./cm selenoid start --vnc
./cm selenoid-ui start
```

### Запуск локально (Переменные на усмотрение, но те, что присутствуют в Selenoid)
```
mvn clean test -Dchrome=78.0 -Dfirefox=70.0 -Dopera=64.0
mvn allure:serve
```