# InstaClone-Android

An advanced Android app with Instagram-like features including feed, stories, direct messaging, explore, reels, and user profiles.

## 📱 Features

### Core Features
- **Feed** - Browse and interact with user posts
- **Stories** - View and create short-lived stories
- **Direct Messaging** - Real-time chat with other users
- **Explore** - Discover new content and profiles
- **Reels** - Short-form video content
- **User Profiles** - Customizable user profiles with follow/unfollow functionality

### Technical Features
- Modern Android development with Kotlin
- Jetpack Compose for UI
- MVVM architecture with Clean Code principles
- Firebase for authentication and real-time database
- Dependency Injection with Hilt
- Coroutines for asynchronous programming
- Room Database for local caching
- Retrofit for API calls
- Material Design 3

## 🛠️ Tech Stack

### Android Framework
- **Minimum SDK:** 28 (Android 9.0)
- **Target SDK:** 34 (Android 14)
- **Kotlin Version:** 1.9.0
- **Android Gradle Plugin:** 8.1.0

### UI/Presentation
- Jetpack Compose 1.5.4
- Material Design 3 1.1.1
- Navigation Compose 2.7.4

### Architecture & DI
- Android Hilt 2.48
- ViewModel & LiveData
- Repository Pattern

### Data Layer
- Firebase Authentication
- Firebase Firestore
- Firebase Cloud Storage
- Room Database 2.6.1
- Retrofit 2 + OkHttp
- Gson for JSON parsing

### Utilities
- Coroutines 1.7.3
- Coil for image loading 2.4.0

## 📂 Project Structure

```
InstaClone-Android/
├── app/                        # Main application module
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/         # Kotlin source code
│   │   │   │   └── com/instaclone/android/
│   │   │   │       ├── ui/     # UI layer
│   │   │   │       ├── data/   # Data layer
│   │   │   │       ├── domain/ # Domain layer
│   │   │   │       └── app/    # Application class
│   │   │   └── res/            # Resources
│   │   └── AndroidManifest.xml # App manifest
│   └── build.gradle.kts        # App module configuration
├── feature/
│   ├── feed/                   # Feed feature module
│   ├── stories/                # Stories feature module
│   ├── messaging/              # Messaging feature module
│   ├── explore/                # Explore feature module
│   ├── reels/                  # Reels feature module
│   └── profile/                # Profile feature module
├── common/
│   ├── data/                   # Shared data layer
│   └── ui/                     # Shared UI components
├── build.gradle                # Root project configuration
├── settings.gradle             # Gradle settings
└── README.md                   # Project documentation
```

## 🚀 Getting Started

### Prerequisites
- Android Studio 2023.1 or higher
- JDK 17
- Android SDK 34
- Gradle 8.1+

### Installation

1. Clone the repository:
```bash
git clone https://github.com/clk7ai/InstaClone-Android.git
cd InstaClone-Android
```

2. Open the project in Android Studio

3. Sync Gradle dependencies

4. Build and run the app

## 📝 Build Instructions

### Debug Build
```bash
./gradlew assembleDebug
```

### Release Build
```bash
./gradlew assembleRelease
```

### Run Tests
```bash
./gradlew test
```

## 🏗️ Architecture

This project follows MVVM architecture with Clean Code principles:

- **UI Layer** - Jetpack Compose screens and ViewModels
- **Domain Layer** - Business logic and use cases
- **Data Layer** - Repository pattern with Firebase and local caching

## 📦 Modules

### Feature Modules
- **feed** - Main feed display and post interactions
- **stories** - Story viewing and creation
- **messaging** - Direct messaging functionality
- **explore** - Content discovery
- **reels** - Short-form video content
- **profile** - User profile management

### Common Modules
- **common:data** - Shared data models and repositories
- **common:ui** - Reusable UI components

## 🔐 Security Features

- Firebase Authentication
- Secure API communication with HTTPS
- Local encryption for sensitive data
- Permission handling for camera, photos, etc.

## 📋 Permissions

The app requests the following permissions:
- INTERNET - For API calls
- READ_EXTERNAL_STORAGE - For image/video access
- WRITE_EXTERNAL_STORAGE - For saving media
- CAMERA - For taking photos/videos
- ACCESS_FINE_LOCATION - For location services
- RECORD_AUDIO - For video/audio recording

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👤 Author

**InstaClone Development Team**
- GitHub: [@clk7ai](https://github.com/clk7ai)

## 🙏 Acknowledgments

- Inspired by Instagram's excellent user experience
- Built with modern Android best practices
- Using cutting-edge Android technologies

## 📞 Support

For support, email support@instaclone.com or open an issue on GitHub.

## 🎯 Roadmap

- [ ] Implement advanced feed algorithms
- [ ] Add video streaming capabilities
- [ ] Implement real-time notifications
- [ ] Add AR filters for stories
- [ ] Implement recommendation system
- [ ] Add live streaming feature
- [ ] Implement analytics
- [ ] Add offline mode support

## 📊 Project Status

This is an active development project. Check back frequently for updates!

**Last Updated:** November 22, 2025
**Status:** 🟢 In Development
