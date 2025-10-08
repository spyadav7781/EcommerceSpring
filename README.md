# Ecommerce Spring Application

A high-performance, microservices-based ecommerce platform built with Spring Boot, featuring scalable architecture, flexible data sourcing, and comprehensive product management.

## 🏗 Architecture & Technical Highlights

**Architected a microservices-based e-commerce platform** using Spring Boot, implementing service discovery and environment-based configuration management for scalable deployment across multiple environments.

**Designed a flexible gateway pattern** allowing seamless switching between internal database and external third-party APIs (FakeStore API), demonstrating adapter design principles and API abstraction layer.

**Implemented a robust product catalog system** with JPA/Hibernate, featuring:
- Complex category-product relationships with proper entity mapping
- Batch product retrieval optimized for performance
- Comprehensive CRUD operations with validation
- Advanced querying capabilities for product search and filtering

**Developed enterprise-grade RESTful APIs** with:
- Proper entity relationships and DTO mapping patterns
- Comprehensive exception handling and error responses
- Structured API documentation following OpenAPI standards
- Efficient data transfer between layers

**Built a generic base entity system** with automated auditing using Spring Data JPA, ensuring consistent timestamp tracking (createdAt, updatedAt) across all domain models with minimal code duplication.

**Created specialized API endpoints** for complex business queries including:
- Product-category joins with optimized database queries
- Batch product lookups for shopping cart functionality
- Inventory management with stock tracking
- Advanced search with multiple filter criteria

## 🚀 Features

### Core Functionality
- **User Management**: Registration, authentication, and profile management with role-based access
- **Product Catalog**: Advanced CRUD operations with category relationships and inventory tracking
- **Shopping Cart**: Distributed cart management with batch product retrieval
- **Order Processing**: Complete order lifecycle with payment integration
- **Inventory Management**: Real-time stock tracking and updates

### Technical Features
- **Microservices Architecture**: Service discovery and inter-service communication
- **Flexible Data Sourcing**: Adapter pattern for internal/external API switching
- **Automated Auditing**: Spring Data JPA auditing for consistent entity tracking
- **RESTful APIs**: Well-structured endpoints with proper HTTP status codes
- **Exception Handling**: Comprehensive error handling with meaningful responses

## 🛠 Technology Stack

### Backend
- **Framework**: Spring Boot 3.5.6
- **Java Version**: 23
- **Security**: Spring Security 6 with JWT
- **Persistence**: Spring Data JPA with Hibernate 6.x
- **Database**: MySQL 8.0 with connection pooling
- **API Documentation**: OpenAPI 3 + Swagger UI

### Architecture & Patterns
- **Microservices**: Service discovery, configuration management
- **Design Patterns**: Adapter, Gateway, DTO, Repository
- **Data Sourcing**: Dual-mode (Internal DB + External APIs)
- **Auditing**: Spring Data JPA automated entity tracking

## 📋 Prerequisites

- Java 17 or higher
- Maven 3.6+
- MySQL 8.0+
- Git

## ⚙️ Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/spyadav7781/EcommerceSpring.git
cd EcommerceSpring
