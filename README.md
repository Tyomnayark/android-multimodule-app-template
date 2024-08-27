# Android multimodule app template

This repository contains a multimodule Android application built using modern Android development practices such as Jetpack Compose, Dagger Hilt for dependency injection, and Retrofit for network requests. The project is structured into several modules to promote modularity and separation of concerns.

## Project Structure

    app: The main application module that serves as the entry point of the application. It depends on the other feature and core modules.
    core:
        core-ui: Contains common UI components, themes, and extensions used across the app.
        core-network: Provides network configurations, API service interfaces, and Retrofit setup.
        core-data: Manages data sources, repositories, and data-related business logic.
    features:
        feature-home: The home screen module that contains the main UI and logic for the home screen.
        feature-details: A module for the details screen that displays detailed information about a selected item.
    domain: Contains the domain layer with use cases, business rules, and interfaces that define the application's core behavior.
    model: Defines the data models and entities used throughout the application.

Technologies and Tools

    Kotlin 1.9.0: The programming language used for all modules.
    Jetpack Compose: A modern toolkit for building native Android UI.
    Dagger Hilt: Dependency injection library that simplifies the setup and usage of Dagger in Android apps.
    Retrofit: A type-safe HTTP client for making network requests.
    Coroutines: For managing asynchronous operations and threading.
    Room: Database library for managing local data persistence.
    Navigation Component: For handling navigation and deep linking between different parts of the app.
