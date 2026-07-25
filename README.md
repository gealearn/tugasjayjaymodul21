# Web UI Automation Test Framework

Repositori ini berisi kerangka kerja pengujian otomatis (*Automated UI Testing Framework*) berbasis BDD (Behavior-Driven Development) untuk pengujian aplikasi web. Framework ini dibangun menggunakan **Java**, **Cucumber**, **Selenium WebDriver**, dan **Gradle**.

---

## 🛠️ Fitur & Arsitektur Utama

* **Behavior-Driven Development (BDD):** Menggunakan Cucumber untuk menulis skenario pengujian dalam bahasa alami (Gherkin format).
* **Page Object Model (POM):** Memisahkan elemen UI (*locators*) dan aksi pengguna dari logika eksekusi tes (*Step Definitions*).
* **Page Object Manager (Factory Pattern):** Pengelolaan inisialisasi *Page Classes* secara terpusat (*Centralized Factory*) dan *lazy initialization* untuk menghemat memori.
* **Automatic Driver Management:** Memanfaatkan *Selenium Manager* bawaan Selenium 4 untuk penanganan *binary browser driver* secara otomatis.
* **Dual Reporting System:** Menghasilkan laporan hasil eksekusi tes dalam format **HTML** interaktif dan **JSON**.

---

## 📁 Struktur Proyek

```text
├── src
│   ├── main
│   │   └── java
│   └── test
│       ├── java
│       │   ├── base            # Pengelolaan konfigurasi WebDriver & Hooks (BaseTest)
│       │   ├── pages           # Page Classes & PageObjectManager (Factory)
│       │   └── stepdef         # Step Definition Cucumber
│       └── resources
│           └── features        # File skenario Cucumber (.feature)
├── build.gradle                # Konfigurasi dependensi dan task Gradle
└── README.md                   # Dokumentasi proyek
```
---

## 🚀 Prasyarat Sistem

Sebelum menjalankan tes, pastikan komputer kamu telah terpasang:
* **Java Development Kit (JDK):** Versi 17 atau yang lebih baru.
* **Google Chrome:** Versi stabil terbaru.
* **Git:** Untuk *version control*.

---

## 🔧 Cara Menjalankan Tes

### 1. Menjalankan Seluruh Tes via Gradle Task

Gunakan perintah CLI berikut melalui terminal di root proyek:

```bash
./gradlew cucumber
```
---
### 2. Menjalankan Tes Berdasarkan Tag Khusus
Kamu dapat menjalankan skenario tertentu menggunakan filter @tags:
```bash
./gradlew cucumber -Ptags="@login"
```

### 3. Menjalankan via JUnit Runner (IDE)
Jika menggunakan IntelliJ IDEA, kamu dapat langsung menjalankan kelas Base.CucumberTest menggunakan tombol Play di samping deklarasi kelas.

---
## 📊 Laporan Pengujian (Test Reports)
Setelah eksekusi tes selesai, laporan otomatis akan dibuat pada direktori berikut:

HTML Report: build/reports/cucumber/cucumber.html

JSON Report: build/reports/cucumber/cucumber.json

Tips: Buka file cucumber.html menggunakan browser (Chrome/Edge/Firefox) untuk melihat ringkasan visual hasil pengujian (Passed, Failed, Skipped).

---
## 🛠️ Dependensi Utama (build.gradle)
Java: Language runtime

Selenium Java: 4.x (Web automation driver)

Cucumber Java & JUnit Platform Engine: 7.x (BDD runner framework)

JUnit 5 / Platform Suite: Testing framework engine

## 📝 Catatan Pengembang
Untuk menambahkan halaman atau skenario baru:

Buat file .feature baru di dalam direktori src/test/resources/features/.

Buat Page Class baru di paket pages dan daftarkan getter-nya di dalam PageObjectManager.

Panggil method dari PageObjectManager di kelas Step Definition terkait.
EOF