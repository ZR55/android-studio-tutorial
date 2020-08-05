# android-studio-tutorial
Practice on building the first Android App with Android Studio


## Resources:

[Android Developer Guide](https://developer.android.com/guide)

[Codelabs](https://codelabs.developers.google.com/?cat=Android)

[Written Courses](https://developer.android.com/courses)

[Online video courses](https://classroom.udacity.com/courses/ud9012/lessons/37a8fa57-7d18-4704-bfb7-da2864cb2e75/concepts/23c9e108-90dc-45d5-84b9-6d43cc49f570) (Udacity)

[Android Basics in Kotlin](https://developer.android.com/courses/android-basics-kotlin/course) (NEW! But only updated to Unit 1)


## Notes for tutorials

### Developing Android Apps with Kotlin" from Udacity

#### Build your first App

* An Android project contains:
   * Kotlin files for the core logic of the app
   * A resources folder for static content such as images and strings
   * An Android Manifest file that defines essential app details so the OS can launch your app
   * Gradle scripts, for building and running your app

#### Layouts

* View and view groups
  * Views that make up a layout are organized as a hierachy of views
  * Views whose primary job is to contain other views are called view groups
    * A linear layout is a view group where you can have arrange views horizontally or vertiacally. When you define a linear layout, you'll set the layout to either horizontal or vertical
    * A constrained layout is a ViewGroup where elements can be arranged freely, are placed by the system based on constraints, and may adapt in size based on screen size and orientation. In fact, it can be used to build any designs. It's the best when arranging small number of views or view groups in a complex layout which might otherwise requires deep nesting layouts
    
    
* Padding and Margin
  * Padding is the spacing inside of the Border of a view element while Margin is spacing outside of the Border.
  
* ScrollView can ONLY have ONE child

* Definition of "Constraint" in Constraint Layout:

  A connection or alignment to another UI element, to the parent layout, or to an invisible guideline.

* Advantages of Constraint Layout:
  * You can make it responsive to screens and resolutions
  * Usually flatter view hierarchy
  * Optimized for laying out its view
  * Free-form which infers to place views anywhere, and the editor helps add constraints
  
* Constraint types:
  * Fixed constraint: a constraint that is specified using a hard-coded number;
  * Adaptable constraint: a constraint that defines a relationship in relative and weighted terms;
  * Absolute positioning: specify the coordinates of the view in the coordinates of its parent;
  * Relative positioning: specify where the view goes in relation to the other views (including its parents).
  
* Chaining types:
  * Spead chain: elements are spread equally in the space
  * Spread chain inside: Elements are spread to use available space with head and tail attached to the parent 
  * Packed chain: elemetns are packed to use minimum space
  * Packed chain with bias: elements are packed to use minimum space and are moved on their axis depending on bias
  * Weighted chain: elements are resized to use all available space according to  specified weights with head and tail glued to parent.
  
  
#### App Navigation

* Navigation terms:
  * **Action Bar**: appears at the top of the application screen. Contains application branding and navigation features such as the overflow menu and the application drawer button.
  * **Up Button**: appears in the action bar and takes us back through previous screens the user has navigated to within the app.
  * **Overflow Menu**: a drop down list of items within the Action Bar that can contain nagivation destinations.
  * **Navigation Drawer**: a menu with a header that slides out from the side of the app.
  * **Navigation Graph**: all of the destinations - the screens that can be navigated to from a single activity are contained in this.
  
* Fragement basics:
  * In a Fragement, you don't inflate the view in onCreate like in an activity, but instead in "**onCreateView()**" method.
  * Use "**context**" property from within a Fragement to get access to string and image resources.
  * UI Fragements contain a layout and occupy a place within the "**Activity Layout**".
  
* The principles of navigation:
  * There's always a fixed starting place which is the screen that users see when they launch your app from the launcher.
  * You can always go back: the navigation state of your app should be represented with a last in first out structure.
  * Up goes back (mostly): the up button in the App and the back button in the system should react mostly the same.
  
* popUpTo inclusive VS popUpTo not-inclusive:
  * popUpTo inclusive: pops off everything on the back stack, including the referenced fragment transaction.
  * popUpTo not-inclusive: pops off everything on the back stack until it finds the referenced fragment transaction.
  
* Up VS Back button:
  * The up button and the back button both navigate within the App
  * The back button navigates out of the App and into other Apps
  
* The functions of menu attributes:
  * **id**:  used by navigation to determine where to navigate
  * **title**: string displayed in the menu
  * **setHasOptionsMenu**: tells Android that the Fragment has a menu
  * **onCreateOptionsMenu**: where you inflate your menu
  * **onOptionsItemSelected**: called when a menu item is selected

* Advantages of using safe arguments:
  * Type safety, as navigation generates the action and the argument class from the navigation graph.
  * Argument enforcement, as non-default arguments are required parameters in the action.
  * (Safe arguments eliminate bugs, not overhead)
  
* **Intent**: it indicates the intention of your App. It's like a description of something that the App wants an activity to perform.
  * **Explicit intents**: it launches an activity using the name of the target activity class (specific) and they are typically only used to launch other activities within your App. The navigation component does this for you when you navigate to other activities in the navigation graph.
  * **Implicit intents**: it specifies WHAT you want to be done and system chooses activity. It provides an abstract description of the operation to be performed, and they are often used to launch activities that are exposed by other App
    * **Intent action**: Each implicit intent must have an action (this action is completely different than the ones we have in the navigation graph). Actions are used in intents to describe the type of thing that the app wants to be done on its behalf. Common actions are defined in the intent class such as view, eidt, or dial.
    * **Intent Category**: implicit intents have a category and datatype to further describe the operation. Categories aren't always used, but are used to further disambiguate the action.
    * **Intent Datatype**: such as text or JPEG image. It allows activites to support specific data types. 
  
* About the "Share" functionality:
  * Because an implicit intent is used, any app that supports using **ACTION_SEND** to send text can be used to share.
  * Inside the `winner_menu.xml` file, `app:showAsAction = "ifRoom"` will cause the menu item to be displayed as an icon in the action bar if there's room.
  * Android uses the [mime type](https://en.wikipedia.org/wiki/Media_type) of our parameter to locate the correct activities to share to. For example, if we want to share images using a mime type of image/JPEG.
  * Intent extras are a key value data structure, similar to what we used in the bundle for fragment arguments.
  
* Navigation methods:
  * **App Drawer navigation**: defaults to popping everything off the backstack except for the start destination.
  * **Menu navigation**: adds to the backstack from the current position.
  * **DrawerLayout**: provides the foundation for the sliding behavior of the navigation drawer.
  * **NavigationView**: material design container that provides the look, feel, and functionality of the Navigation Drawer.
  
* **Navigation Listensers** are interfaces that contains a single method that gets called every time we navigate. They allow use to react and do something during navigation, or in our case, block the drawer from coming out after nagivating away from the start destination.

* Transitions:
  * **Enter Transition**: played for the destination to be navigated to when it's entered.
  * **Exit Transition**: played for the destination to be navigated to when another destination replaces the current one.
  * **Pop Enter Transition**: played for the destination is returned to view from the back stack.
  * **Pop Exit Transition**: played when the current destination is popped off the back stack.
  
  
#### Activity & Fragment Lifecycle

* Activity Lifecycle states (the status of activity)
  * Created
  * Started
  * Resumed
  * Destoryed
  * Initialized
  
* Activity lifecycle callback methods (you'll probably need to write some code when the activity status changes):
  * onCreate
  * onStart
  * onResume
  * onDestory
  * onPause
  * onStop
  * onRestart
  
* **Application class**: a base class that contains global application state for your entire app.
