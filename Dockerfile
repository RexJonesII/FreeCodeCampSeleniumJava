# Используем базовый образ OpenJDK 17
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Устанавливаем Git и Maven
RUN apt-get update && \
    apt-get install -y git maven && \
    rm -rf /var/lib/apt/lists/*

# Клонируем репозиторий
RUN git clone https://github.com/nervig/FreeCodeCampSeleniumJava.git .

# Скачиваем зависимости и собираем проект
RUN mvn clean install

# Запускаем тесты по умолчанию
CMD ["mvn", "test"]
