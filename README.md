# Android multimodule app template

This repository contains a multimodule Android application built using modern Android development practices such as Jetpack Compose, Dagger Hilt for dependency injection, and Retrofit for network requests. The project is structured into several modules to promote modularity and separation of concerns.

## Project Structure

   - <b>app </b>: 
   
    The main application module that serves as the entry point of the application. It depends on the other feature and core modules.

   - <b>feature_main </b>:
   
    The home screen module that contains the main UI and logic for the home screen.
     
   - <b>domain</b>: 
    
    Contains the domain layer with use cases, business rules, and interfaces that define the application's core behavior.

   - <b>data</b>:

    Contains repository implementations that interact with SharedPreferences and other data sources.

   - <b>core_ui</b>:

    Includes extensions and utilities specifically for Jetpack Compose, enhancing UI development.

   - <b>core_utils</b>:

    Provides various utility extensions used across the application for general-purpose functionality.    

## Technologies and Tools

- **Kotlin 1.9.0**: The programming language used for all modules.

- **Jetpack Compose**: A modern toolkit for building native Android UI.

- **Dagger Hilt**: Dependency injection library that simplifies the setup and usage of Dagger in Android apps.

- **Coroutines**: For managing asynchronous operations and threading.

- **Navigation Component**: For handling navigation and deep linking between different parts of the app.

- **Flow**: A reactive stream API for handling asynchronous data flows and events.