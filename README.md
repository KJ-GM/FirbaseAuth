# FirbaseAuth


1) Create project in Firebase

2) Loging to android studio using google

2) Go to android studio "Tools" on top, then click firebase, then Click "authentication using custom authentication system"

3) Follow along with your code...

4) Done not forget to set the default page for android in manifest:

```sh
<activity
            android:name=".CalcActivity"
            android:exported="false" />
        <activity
            android:name=".RegisterationActivity"
            android:exported="false" />
        <activity
            android:name=".LoginActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        
        ```
