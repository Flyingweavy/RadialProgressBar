![alt text](https://github.com/MindorksOpenSource/RadialProgressBar/blob/master/images/logo.jpg)

# Radial Progress Bar

Radial ProgressBar inspired  by Apple Watch OS. It is highly Customisable <br/>
### Preview of Radial Progress Bar
<img  height="200" src="https://github.com/MindorksOpenSource/RadialProgressBar/blob/master/images/1.jpg"> <img  width="200" src="https://github.com/MindorksOpenSource/RadialProgressBar/blob/master/images/2.jpg">

[![Mindorks](https://img.shields.io/badge/mindorks-opensource-blue.svg)](https://mindorks.com/open-source-projects)
[![Mindorks Community](https://img.shields.io/badge/join-community-blue.svg)](https://mindorks.com/join-community)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Getting Started

##### Step 1. Add the JitPack repository to your Add it in your root `build.gradle` at the end of repositories:


```
allprojects {
    repositories {
   	   maven { url 'https://jitpack.io' }
    }
}
```

##### Step 2. Add the dependency
```
dependencies {
	        implementation 'com.github.MindorksOpenSource:RadialProgressBar:v1.0'
	}
```

##### Step3. To use this in XML File, use

```
  <com.mindorks.RadialProgressBar
            android:layout_width="200dp"
            android:layout_height="200dp"
            android:id="@+id/progress_view"
            app:useRoundedCorner="true"
            app:innerMaxProgress="100"
            app:outerMaxProgress="100"
            app:centerMaxProgress="100"
            app:isAnimationOn="true"
            app:innerProgress="50"
            app:centerProgress="50"
   />

```

##### Step 4. Link the XML in Activity File using,

```
val radialProgressBar = findViewById(R.id.progress_view)

or

RadialProgressBar rpb = findViewById(R.id.progress_view) //if using Java
```

thats it and how you can use the RadialProgressView in your project.

#### To Customise it according to your need you can use,

| Feature                                   | XML                              | Activity (Java/Koltin)        |Default|
| :-------------                         |:-------------                           | :-----            |:----
|Set Start Angle OuterView|app:outerProgressStartAngle="angle"|rpb.setStartAngleOuterView(angle)|270|
|Set Start Angle CenterView|app:centerProgressStartAngle="angle"|rpb.setStartAngleCenterView(angle)|270|
|Set Start Angle InnerView|app:innerProgressStartAngle="angle"|rpb.setStartAngleInnerView(angle)|270|
|Set EmptyProgressColorOuterView|app:outerEmptyProgressColor="color"|rpb.setEmptyProgressColorOuterView(color)|#F5F5F5|
|Set EmptyProgressColorCenterView|app:centerEmptyProgressColor="color"|rpb.setEmptyProgressColorCenterView(color)|#F5F5F5|
|Set EmptyProgressColorInnerView|app:innerEmptyProgressColor="color"|rpb.setEmptyProgressColorInnerView(color)|#F5F5F5|
|Set MaxProgressOuterView|app:outerMaxProgress="Integer"|rpb.setMaxProgressOuterView(Integer)|100|
|Set MaxProgressCenterView|app:centerMaxProgress="Integer"|rpb.setMaxProgressCenterView(Integer)|100|
|Set MaxProgressInnerView|app:innerMaxProgress="Integer"|rpb.setMaxProgressInnerView(Integer)|100|
|Set OuterProgress|app:outerProgress="Integer"|rpb.setOuterProgress(Integer)|0|
|Set CenterProgress|app:centerProgress="Integer"|rpb.setCenterProgress(Integer)|0|
|Set InnerProgress|app:innerProgress="Integer"|rpb.setInnerProgress(Integer)|0|
|Set OuterProgressColor|app:outerProgressColor="color"|rpb.setOuterProgressColor(color)|#f52e67|
|Set CenterProgressColor|app:centerProgressColor="color"|rpb.setCenterProgressColor(color)|#c2ff07|
|Set InnerProgressColor|app:innerProgressColor="color"|rpb.setInnerProgressColor(color)|#0dffab|
|Set Elevation|app:hasElevation="true/false"|rpb.hasElevation(true/false)|false|
|Set EmptyProgressBar|app:hasEmptyProgressBar="true/false"|rpb.hasEmptyProgressBar(true/false)|false|
|Set Animation|app:isAnimationOn="true/false"|rpb.setAnimationInProgressView(true/false)|true|
|Set RoundedCorner|app:useRoundedCorners="true/false"|rpb.useRoundedCorners(true/false)|true|
|Set ProgressValues|----|rpb.setProgressValues(int,int,int)|----|
|Set MaxProgressValues|----|rpb.setMaxProgressValues(int,int,int)|----|

> **angle = 0/90/180/270

## If this library helps you in anyway, show your love :heart: by putting a :star: on this project :v:

[Check out Mindorks awesome open source projects here](https://mindorks.com/open-source-projects)

Contributor : [Himanshu Singh](https://github.com/hi-manshu)

