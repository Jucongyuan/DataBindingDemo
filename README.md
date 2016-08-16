# DataBindingDemo

##概述
网上关于DataBinding的文章不算太多，而且具体的实例特别少，所以就写了一个简单的Demo,使用的就是DataBinding。


##如何使用DataBinding
在项目build.gradle文件中添加开启dataBinding
android {
    compileSdkVersion 24
    buildToolsVersion "23.0.1"

    defaultConfig {
        applicationId "com.jucongyuan.databindingdemo"
        minSdkVersion 9
        targetSdkVersion 24
        versionCode 1
        versionName "1.0"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }

    dataBinding {
        enabled true
    }
}
