# sport-analysis

## 專案說明 (Project Description)

sport-analysis 是一個基於 Spring Boot 3.5 開發的運動數據分析平台，提供 Docker 服務資訊查詢等功能。此專案採用現代化的 Java 技術堆疊，整合了 MyBatis 持久層框架與 Log4j2 日誌系統，適用於微服務架構部署。

sport-analysis is a Spring Boot 3.5-based sports data analysis platform that provides Docker service information query and other features. This project uses a modern Java technology stack, integrating MyBatis persistence framework and Log4j2 logging system, suitable for microservice architecture deployment.

## 技術堆疊 (Technology Stack)

- **框架 (Framework)**: Spring Boot 3.5.10
- **Java 版本 (Java Version)**: 17
- **建構工具 (Build Tool)**: Maven
- **資料庫持久層 (ORM)**: MyBatis 3.0.5
- **日誌系統 (Logging)**: Log4j2 with Async Support
- **CI/CD**: Jenkins

## 主要功能 (Features)

- Docker 服務資訊查詢 (Docker service information query)
- RESTful API 介面 (RESTful API interface)
- 非同步日誌記錄 (Asynchronous logging)

## 快速開始 (Quick Start)

### 環境需求 (Prerequisites)

- Java 17 或更高版本 (Java 17 or higher)
- Maven 3.6+ 

### 安裝與執行 (Installation & Running)

1. 克隆專案 (Clone the repository)
```bash
git clone https://github.com/lontn/sport-analysis.git
cd sport-analysis
```

2. 編譯專案 (Build the project)
```bash
./mvnw clean package
```

3. 執行應用程式 (Run the application)
```bash
./mvnw spring-boot:run
```

應用程式將在 `http://localhost:8088` 上啟動。

The application will start at `http://localhost:8088`.

## API 端點 (API Endpoints)

- `GET /sport/getdockerservice` - 取得 Docker 服務資訊 (Get Docker service information)

## 專案結構 (Project Structure)

```
sport-analysis/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/sport/ball/application/
│   │   └── resources/
│   └── test/
├── pom.xml
└── README.md
```

## 開發團隊 (Development Team)

本專案由開發團隊維護。

This project is maintained by the development team.

## 授權 (License)

請參考專案授權文件。

Please refer to the project license documentation.