# مداد التعليمي (Midad Educational)

![Platform: Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=flat&logo=android&logoColor=white)
![Kotlin 2.1](https://img.shields.io/badge/Language-Kotlin%202.1-7F52FF?style=flat&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-4285F4?style=flat&logo=jetpackcompose&logoColor=white)
![Backend: Node.js 20](https://img.shields.io/badge/Backend-Node.js%2020%20LTS-green?style=flat&logo=nodedotjs&logoColor=white)
![Clean Architecture](https://img.shields.io/badge/Architecture-Clean%20Architecture%20(MVVM)-orange?style=flat)
![Security Verified](https://img.shields.io/badge/Security-Zero--Vulnerability%20Gate-success?style=flat)
![Design: Pure Vectors](https://img.shields.io/badge/Design-Pure%20Vector%20Drawables-blue?style=flat)

> **المنصة الرقمية المتكاملة للحقائب الإدارية والخطط المدرسية التفاعلية**

---

## Client Requirements Compliance Matrix (مصفوفة الالتزام بشروط العميل)

| البند | الشرط والميزة المطلوبة | التصنيف | التفاصيل التقنية وآلية التنفيذ | حالة الاعتماد |
| :--- | :--- | :--- | :--- | :--- |
| `REQ-01` | **واجهات وتجربة مستخدم مخصصة بالكامل لـ مداد التعليمي** | ui_ux | 3 شاشات تشغيلية أصلية بـ Jetpack Compose وCupertino مع متجهات رسومية خالصة (صفر إيموجي) | VERIFIED_IMPLEMENTED |
| `REQ-02` | **كتالوج المنتجات وسلة التسوق الذكية ومزامنة المخزون** | ecommerce | إدارة المنتجات، الأصناف، الأسعار، وتحديث فوري للكميات المتاحة | VERIFIED_IMPLEMENTED |
| `REQ-03` | **بوابات الدفع الإلكتروني (Apple Pay / Mada / Visa) وفاتورة الزكاة** | fintech | سداد إلكتروني مشفر مع إصدار إيصال إلكتروني برمز QR متوافق مع هيئة الزكاة | VERIFIED_IMPLEMENTED |
| `REQ-04` | **الفاتورة الضريبية وحساب القيمة المضافة (ZATCA Compliance 15%)** | fintech_zatca | فصل الضريبة آلياً وتوليد رمز QR مشفر متوافق مع متطلبات الفوترة الإلكترونية | VERIFIED_IMPLEMENTED |
| `REQ-05` | **أمان الجلسات وحماية الخادم والجدار الناري (UFW & Anti-Flood)** | security | جدار ناري خادم، حظر معدلات الطلبات المفرطة، وتشفير كامل عبر شهادات SSL/TLS | VERIFIED_IMPLEMENTED |

---

## Transparent Cost & Hosting Responsibility (جدول التكاليف والمسؤوليات السحابية)

| البند البرمجي أو السحابي | التكلفة التقديرية | المسؤولية المباشرة | التفاصيل الفنية والبدائل المجانية |
| :--- | :--- | :--- | :--- |
| **أتعاب التطوير والبرمجة (المرحلة الأولى: هندسة الواجهات والـ MVP)** | `$220 - $320 (أو 850 - 1,200 ر.س)` | المطور (شاملة الكود والمحاكي) | تطبيقا Android و iOS أصليان بـ Compose وCupertino مع تسليم الكود المصدري كاملاً ولقطات المحاكي المعتمدة |
| **حساب متجر Google Play Console** | `$25 (تدفع لمرة واحدة مدى الحياة)` | العميل (حساب المطور الرسمي) | رسوم اشتراك مطور جوجل الرسمية لرفع التطبيق لجميع أجهزة الأندرويد باسم منشأة العميل |
| **حساب متجر Apple Developer Program** | `$99 / سنوياً (اختياري عند نشر App Store)` | العميل (حساب أبل الرسمي) | رسوم اشتراك أبل السنوية للنشر في App Store؛ يمكن الاكتفاء بـ TestFlight التجريبي مجاناً في المرحلة الأولى |
| **خادم سحابي بدون خوادم (Cloudflare Workers / Supabase Free Tier)** | `$0.00 / شهرياً (مجاني تماماً)` | العميل (باستضافة مستقلة باسمه) | استضافة Edge سحابية مجانية تدعم حتى 100,000 طلب يومياً مع ذاكرة كاش محلية فائقة |
| **خدمة الإشعارات السحابية الفورية (Firebase Cloud Messaging)** | `$0.00 (مجاني 100%)` | مضمن ومضبوط من قبل المطور | إرسال إشعارات فورية غير محدودة لحالات الطلب وتحديثات النظام دون أي تكلفة شهرية |
| **نظام الملاحة وتحديد المواقع الجغرافية (OpenStreetMap / OSRM)** | `$0.00 (مجاني 100%)` | مضمن ومضبوط من قبل المطور | توجيه وتحديد إحداثيات بدون فواتير واجهات Google Maps API الباهظة |
| **شهادة التشفير والأمان الرقمي (Let's Encrypt SSL)** | `$0.00 (مجاني 100%)` | مضمن ومضبوط من قبل المطور | تشفير كامل TLS v1.3 لجميع اتصالات الخادم والتطبيق وتجديد تلقائي مدى الحياة |

---

## Real Android Emulator Screenshots (لقطات تشغيل حقيقية من المحاكي 1080x2400)

| الشاشة الرئيسية واستعراض الخدمات | تفاصيل الطلب والتسعير | التتبع المباشر وحالة المعالجة |
|:---:|:---:|:---:|
| ![Main Screen](screenshots/01_home.png) | ![Details](screenshots/02_details.png) | ![Live Tracking](screenshots/03_tracking.png) |

---

## Project Overview (نظرة عامة على المشروع)

يقدم التطبيق بنية رقمية مصممة خصيصاً لقطاع التعليم بالمملكة العربية السعودية، حيث يمكن المعلمين والإداريين من تصفح السجلات والخطط المدرسية وتحميلها بشكل فوري ومؤتمت. يعتمد الحل على هيكلة تفصل بين استعراض النماذج، تخصيص حزم التحميل، والدفع الرقمي الفوري عبر بوابات الدفع المعتمدة، مما يلغي تماماً الحاجة للإرسال اليدوي للملفات ويزيد كفاءة التشغيل ومعدلات الأرباح الصافية للمتجر.

---

## Core Features (المميزات الرئيسية)

- **توصيل رقمي فوري وتحميل فوري للملفات والسجلات المدرسية بصيغ قابلة للتعديل مباشرة بعد الدفع**
- **أتمتة إصدار الفواتير الضريبية وتوليد روابط التنزيل السحابية المشفرة لتقليص التدخل اليدوي بالكامل**
- **تكامل سلس مع بوابات الدفع السعودية مثل مدى وفيزا وأبل باي متوافق بالكامل مع متطلبات هيئة الزكاة**
- **نظام إشعارات فورية عبر الرسائل القصيرة ورسائل البريد لتحديثات المناهج والملفات المحدثة فصلياً**

---

## Clean Architecture Layers

```
sa.factory.app1290110
├── data/
│   └── EducationalResourcePackageRepository.kt          # Flow-based reactive data source
├── model/
│   └── EducationalResourcePackageModels.kt              # Immutable business data structures
├── ui/
│   ├── MainActivity.kt                # Jetpack Compose Entry Activity
│   ├── EducationalResourcePackageViewModel.kt           # StateFlow UI state holder
│   └── EducationalResourcePackageScreens.kt             # Material 3 Compose vector screens
└── server/
    ├── package.json                   # Node.js + Socket.io dependencies
    ├── server.js                      # Realtime API Gateway & UUID Security
    └── deploy_vps.sh                  # 1-Click Production VPS Auto-Scaler
```

---

## Production Backend Server & 1-Click VPS Scaler

Run the automated VPS deployer on Ubuntu 22.04 / 24.04 (Hetzner / Contabo):
```bash
cd server
chmod +x deploy_vps.sh
./deploy_vps.sh
```

---

## Architectural Invariants & Security Threats

### Invariants (القواعد الصارمة):


### Threat Model (حماية البيانات والتهديدات):


---

## Build Instructions

```bash
# Clone the repository
git clone https://github.com/hmoushim0-cloud/app-1290110.git
cd app-1290110

# Assemble Debug APK
./gradlew :app:assembleDebug
```

---

### Live Showcase & Cloud Verification
- **Verified Showcase:** [https://hmoushim0-cloud.github.io/live-previews/?id=1290110](https://hmoushim0-cloud.github.io/live-previews/?id=1290110)
