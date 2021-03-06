![cover](https://user-images.githubusercontent.com/83513508/138772386-b3489037-097c-4c74-b9a8-50d8b11dd30c.png)

# Note App
A Simple Note App 📱 built to demonstrate use of Jetpack Compose and MVVM with Clean Architecture.

<br />

***Try latest Note app apk from below 👇***

[![Note App](https://img.shields.io/badge/NoteApp-APK-black.svg?style=for-the-badge&logo=android)](https://github.com/mdzihad89/note_app_jetpack_compose/releases/download/v1.0.0/NoteApp.apk)


<br />

## UI Design 🎨

***Click to View Note app Design from below 👇***

[![Note App](https://img.shields.io/badge/NoteApp-FIGMA-black.svg?style=for-the-badge&logo=figma)](https://www.figma.com/file/zqTjc9PMDp7IU21WsjXTNz/Note-App?node-id=0%3A1)

<br />

Splash | Note List | Add Note | Edit Note | Delete Note
--- | --- | --- |--- |--- 
![](https://user-images.githubusercontent.com/83513508/138772381-9da62fc0-f74a-46eb-8013-1cd49b0ba84e.png) | ![](https://user-images.githubusercontent.com/83513508/138772380-00ae2c83-b870-40f5-b1a3-44f8099c6d88.png) | ![](https://user-images.githubusercontent.com/83513508/138772378-77e280a0-e7b5-410a-b737-afc630a25685.png) | ![](https://user-images.githubusercontent.com/83513508/138772374-2b01072b-b456-483e-a770-6b4c872ef5e9.png) | ![](https://user-images.githubusercontent.com/83513508/138772371-cb3af432-bb4d-4ff0-ab9b-1f04578270b5.png)

<br />


## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Jetpack Compose](https://developer.android.com/jetpack/compose?gclid=CjwKCAjwq9mLBhB2EiwAuYdMtSKZVh5cmsYUiVg9ptxj16SFBeeBZXNyNITYguZmuiKOEuaGnZc8vBoCFw4QAvD_BwE&gclsrc=aw.ds) - Modern UI toolkit  for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [Flow](https://kotlinlang.org/docs/reference/coroutines/flow.html) - A flow is an asynchronous version of a Sequence, a type of collection whose values are lazily produced.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
  - [Room](https://developer.android.com/topic/libraries/architecture/room) - SQLite object mapping library.
  - [Dagger Hilt dependency injection](https://developer.android.com/training/dependency-injection/hilt-android) -Reduce boilerplate and make code easier to maintain.
- [Material Components for Android](https://github.com/material-components/material-components-android) - Modular and customizable Material Design UI components for Android.
- [Figma](https://figma.com/) - Figma is a vector graphics editor and prototyping tool which is primarily web-based.

<br />

## Package Structure 📦
 ```
 com.mdzihad.noteapp
|───├───di
├───feature_note
│   ├───data
│   │   ├───data_source
│   │   └───repository
│   ├───domain
│   │   ├───model
│   │   ├───repository
│   │   ├───use_case
│   │   └───util
│   └───presentation
│       ├───add_edit_note
│       │   └───components
│       ├───notes
│       │   └───components
│       ├───splash
│       └───util
└───ui
    └───theme
   ```
 <br />


## Architecture 🗼
This app uses MVVM with Clean Architecture.

![](https://user-images.githubusercontent.com/83513508/138778269-a83b4574-a4f9-400d-a46c-465ecf403b6e.jpg)

## Build-tool 🧰
[Android Studio Arctic Fox](https://android-developers.googleblog.com/2021/07/android-studio-arctic-fox-202031-stable.html)
<br>


## Contact 📩
Have an project? DM me at 👇

Drop a mail to:- mdzihad321@gmail.com

<br />

## License 🔖
```
    Apache 2.0 License


    Copyright 2021 Md Zihad

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

```




