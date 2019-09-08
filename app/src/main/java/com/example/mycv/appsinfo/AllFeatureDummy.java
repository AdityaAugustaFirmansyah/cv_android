package com.example.mycv.appsinfo;

import java.util.ArrayList;

public class AllFeatureDummy {
    private static String [][] allFeature = new String[][]{
            {
                    "tablayout",
                    "Tab layout are visible below toolbar with View pager, used to create swipeable views on. Tabs are designed to work with fragments.",
                    "https://developer.android.com/reference/android/support/design/widget/TabLayout"
            },
            {
                    "ScrollView",
                    "ScrollView is used to scroll the child elements of palette inside ScrollView. Android supports vertical scroll view as default scrollView",
                    "https://developer.android.com/reference/android/widget/ScrollView"
            },
            {
                    "RelativeLayout",
                    "RelativeLayout is a view group that displays child views in relative positions. The position of each view can be specified as relative to sibling elements",
                    "https://developer.android.com/guide/topics/ui/layout/relative"
            },
            {
                    "LinearLayout",
                    "Linear layout is a simple layout used in android for layout designing. In the Linear layout all the elements are displayed in linear fashion means all the childs/elements of a linear layout are displayed according to its orientation.",
                    "https://developer.android.com/reference/android/widget/LinearLayout"
            },
            {
                    "Constraint Layout",
                    "The Layout Editor uses constraints to determine the position of a UI element within the layout. A constraint represents a connection or alignment to another view",
                    "https://developer.android.com/reference/android/support/constraint/ConstraintLayout"
            },
            {
                    "ImageView",
                    "Displays image resources, for example Bitmap or Drawable resources. ImageView is also commonly used to apply tints to an image and handle image scaling.",
                    "https://developer.android.com/reference/android/widget/ImageView"
            },
            {
                    "TextView",
                    "This code sample demonstrates how to modify the contents of the text view defined in ... android:editable, If set, specifies that this TextView has an input method",
                    "https://developer.android.com/reference/android/widget/TextView"
            },
            {
                    "CoordinatorLayout",
                    "The Coordinator Layout is described as a “a super-powered FrameLayout” according to the docs. It is used to facilitate how views within your layout interact with each other.",
                    "https://developer.android.com/reference/android/support/design/widget/CoordinatorLayout"
            },
            {
                    "Button",
                    "In android, Button is a user interface control which is used to perform an action whenever the user click or tap on it",
                    "https://developer.android.com/reference/android/widget/Button"
            },
            {
                    "retrofit",
                    "Retrofit is a type-safe HTTP client for Android and Java – developed by Square (Dagger, Okhttp).",
                    "https://square.github.io/retrofit/"
            },
    };

    public static ArrayList<AllFeatureModel> models(){
            ArrayList<AllFeatureModel>models = new ArrayList<>();
            for (String [] a:allFeature){
                    AllFeatureModel allFeatureModel = new AllFeatureModel();
                    allFeatureModel.setTitle(a[0]);
                    allFeatureModel.setDesc(a[1]);
                    allFeatureModel.setLink(a[2]);
                    models.add(allFeatureModel);
            }
            return models;
        }
}
