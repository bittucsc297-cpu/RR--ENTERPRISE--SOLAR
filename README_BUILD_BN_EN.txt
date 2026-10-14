RR ENTERPRISE — Android Studio project
PM Surya Ghar Muft Bijli Yojana | Bengali + English

IMPORTANT
This ZIP contains an Android Studio project/source, not a compiled APK.
The current workspace does not have the Android SDK/Gradle build environment
needed to compile and sign an APK here. No APK is being represented as ready.

BUILD APK IN ANDROID STUDIO
1. Install Android Studio on a computer.
2. Extract this ZIP.
3. Android Studio > Open, then choose the extracted RREnterpriseSolar folder.
4. Allow Gradle sync and install the Android SDK platform requested by the project.
5. Select Build > Build Bundle(s) / APK(s) > Build APK(s).
6. When finished, choose Locate. The debug APK is usually under:
   app/build/outputs/apk/debug/app-debug.apk
7. Transfer app-debug.apk to the Android phone and install it.
   If prompted, allow installation from that file manager/browser.

APP FEATURES
- Bengali/English switch
- Customer registration enquiry form
- Document checklist
- Subsidy information disclaimer
- WhatsApp, call and email links
- West Bengal service-area details

CONTACT
WhatsApp: 7638866630
Mobile: 9679820016
Contact: 7430948659
Email: rr.enterprise6000@gmail.com

The customer enquiry form prepares a WhatsApp message; it does not store
customer data in a database. This is not an official government app.

OPTIONAL CLOUD BUILD (GitHub Actions)
This project includes .github/workflows/build-apk.yml.
Upload the extracted project to a GitHub repository. Open the repository's
Actions tab and run "Build RR ENTERPRISE APK" (or push to main). When it
finishes, open the workflow run, download the artifact named
RR-ENTERPRISE-debug-APK, extract it, and install app-debug.apk on Android.
This still requires the user to upload the source to GitHub and download the
build artifact; the APK has not been compiled in this workspace.
