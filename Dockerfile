# Используем базовый образ с JRE
FROM openjdk:17-alpine

# Копируем JAR-файл в рабочую директорию
COPY build/libs/cloud-config-app-micriservice-0.0.1-SNAPSHOT.jar /app.jar

# Экспорт порта, если приложение должно быть доступно через сеть
EXPOSE 8888

# Команда для запуска приложения
ENTRYPOINT ["java","-jar","/app.jar"]