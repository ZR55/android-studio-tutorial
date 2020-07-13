# android-studio-tutorial
Practice on building the first Android App with Android Studio


## Resources:

[Android Developer Guide](https://developer.android.com/guide)

[Codelabs](https://codelabs.developers.google.com/?cat=Android)

[Written Courses](https://developer.android.com/courses)

[Online video courses](https://classroom.udacity.com/courses/ud9012/lessons/37a8fa57-7d18-4704-bfb7-da2864cb2e75/concepts/23c9e108-90dc-45d5-84b9-6d43cc49f570) (Udacity)


## Notes for tutorials

### Developing Android Apps with Kotlin" from Udacity

##### Build your first App

* An Android project contains:
   * Kotlin files for the core logic of the app
   * A resources folder for static content such as images and strings
   * An Android Manifest file that defines essential app details so the OS can launch your app
   * Gradle scripts, for building and running your app

##### Layouts

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
