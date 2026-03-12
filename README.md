# Android-Backstack-Task
# RGB Navigation Challenge 🎨

A simple Android application built with **Kotlin** to demonstrate mastery of the **Activity Lifecycle** and **Back Stack management**. This project specifically addresses the "Navigation Loop" issue.

---

## 📸 Screenshots

| Red Activity | Green Activity | Blue Activity |
| :---: | :---: | :---: |
| <img src="https://github.com/user-attachments/assets/c4e0009b-d48f-4165-97ef-bd6fe9d2641d" width="250"> | <img src="https://github.com/user-attachments/assets/6768816f-51cc-41ab-8adc-26252738a9cf" width="250"> | <img src="https://github.com/user-attachments/assets/3cd8f4bf-7179-4609-b636-691fd9e5a01b" width="250"> |

---

## 🚀 The Challenge: Fixing the Back Button Issue
In standard Android navigation, moving from Red → Green → Blue and then back to Red creates a recursive stack. This means the user would have to press the "Back" button multiple times to exit the app.

### The Solution
To provide a professional user experience, I implemented **Intent Flags** to manage the Task Stack efficiently:

```kotlin
val intent = Intent(this, MainActivity::class.java)
// This clears all activities on top of RedActivity and brings it to the front
intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
startActivity(intent)

🛠 Tech Stack & Concepts

    Language: Kotlin

    Framework: Android SDK

    Key Concepts: * Intent & Intent Flags

        Activity Lifecycle

        Task Stack Management

        
🏁 How to Run

    Clone the repository.

    Open in Android Studio.

    Build and run on an emulator or physical device.
