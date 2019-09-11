# Firebase Console through send notification in android app
Firebase Console through send notification in android app

``
First craete project in your firebase acount then get the google_services.json file and store project app foleder
``

``
Android gradle add classpath in google play service 
`` 

 ``classpath 'com.google.gms:google-services:4.2.0'      



``
Dependancy add in build.gradle
``
``
 implementation 'com.google.firebase:firebase-messaging:17.3.4'
 ``
 ``
 implementation 'com.google.firebase:firebase-core:16.0.4'
``


# sevices class get the your token


    <service android:name=".MyFirebaseInstanceIDService">
            <intent-filter>
                <action android:name="com.google.firebase.INSTANCE_ID_EVENT"/>
            </intent-filter>
        </service>
        <service
            android:name=".MyFirebaseMessagingService"
            android:exported="false">
            <intent-filter>
                <action android:name="com.google.firebase.MESSAGING_EVENT" />
            </intent-filter>
        </service>



``
get the app register token and go to firebase console and sent notification in your android app
``

