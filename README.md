# Broadcast Receiver Utility Android App

## Overview

This Android application demonstrates various uses of **Broadcast Receivers** for real-time system and custom event handling. It includes features like monitoring battery status, receiving custom broadcast messages, detecting WiFi connectivity changes, and an interactive user interface to select these functionalities.

---

## Download the App in Your Android Device: [BRU Android App](https://drive.google.com/file/d/1NKDIp6HtN8nLOrOxOcSv1uDgMlalkIL9/view?usp=sharing)
---

## Features

### 1. Main Activity

* Provides a dropdown menu for selecting and navigating between the different functionalities:

  * Custom Broadcast Receiver
  * WiFi State Change
  * System Battery Notification Receiver


### 2. Custom Broadcast Message

* **custom\_broadcast\_receiver.java:** Lets users input a custom message.
* **custom\_broadcast\_display.java:** Displays the received message from the custom broadcast.

### 3. WiFi Network Status Monitor

* **wifi.java:** Listens for WiFi connectivity changes and displays network type and connection status in real-time.

### 4. Battery Status Guess & Display

* **battery\_receive.java:** Allows users to guess the current battery percentage.
* **battery\_display.java:** Displays the actual battery percentage, the user’s guess, and the charging status.
* Shows warnings when the battery is low or fully charged.

---

## Screenshots

![BRU_img](https://github.com/user-attachments/assets/2b30b289-1d01-4e09-aa6f-8cfda7d06383)


---

## Installation & Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Syeda-Mahjabin-Proma/BroadcastReceiverUtility.git
   ```
2. Open the project in **Android Studio**.
3. Build and run the app on an emulator or a physical Android device.
4. Use the main screen dropdown to navigate between features.

---

## Technologies Used

* **Language:** Java
* **Development Environment:** Android Studio
* **Android Components:** BroadcastReceiver, Intent, IntentFilter, TextView, Spinner, Button, EditText

---

## Code Structure

| File Name                        | Description                                      |
| -------------------------------- | ------------------------------------------------ |
| `MainActivity.java`              | Main screen with options to select features      |
| `battery_receive.java`           | Takes user input to guess battery percentage     |
| `battery_display.java`           | Displays actual battery info and charging status |
| `custom_broadcast_receiver.java` | Allows user to send a custom message             |
| `custom_broadcast_display.java`  | Displays the received custom message             |
| `wifi.java`                      | Monitors WiFi state changes and shows status     |

---

## XML Layout Files

* `activity_main.xml` — Main screen layout with spinner and button.
* `battery_receive.xml` — UI to input battery guess.
* `battery_display.xml` — Shows guessed and real battery percentages plus status.
* `custom_broadcast_receiver.xml` — Input for custom message.
* `custom_broadcast_display.xml` — Displays the custom message.
* `wifi.xml` — Displays network type and connectivity status.

---

## How to Use

1. Launch the app.
2. Select a feature from the dropdown menu.
3. Follow the on-screen instructions for each feature:

   * Guess battery percentage and see actual stats.
   * Send a custom message and view it.
   * Monitor WiFi connectivity changes live.

---

## How to Contribute

We welcome contributions to improve this project! Here’s how you can help:

1. **Fork the repository** to your GitHub account.
2. **Clone your fork** to your local machine:

   ```bash
   git clone https://github.com/your-username/BroadcastReceiverUtility.git
   ```
3. **Create a new branch** for your feature or bug fix:

   ```bash
   git checkout -b feature-or-bugfix-name
   ```
4. Make your changes and **commit** them with a clear message:

   ```bash
   git commit -m "Add feature X / Fix bug Y"
   ```
5. **Push the changes** to your forked repository:

   ```bash
   git push origin feature-or-bugfix-name
   ```
6. Open a **Pull Request** on the original repository with a description of your changes.
7. Wait for review and feedback — then celebrate your contribution! 🎉

---

## License

This project is licensed under the [Apache-2.0 license](https://www.apache.org/licenses/).
