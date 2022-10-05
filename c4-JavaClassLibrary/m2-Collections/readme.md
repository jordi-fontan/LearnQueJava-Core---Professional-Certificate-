## Collections

 ### Slide 1
 
- Collections offer an alternative to arrays that is more flexible and more powerful
  	- One of the main limitations of an array is that its lenght is fixed when it is created
  	- Collections will grow to hold more elemens automatically
- Collections rely heavily on interfaces to provide common behaviour.
- There are three major types of Collections ( each one for different porpuses):
    - **Sets**  : exclude duplicates , extend Collection
    - **Lists** : include duplicates , extend Collection
    - **Maps** : key value pair access, doesn't extend Colletion

---

 ### Slide 2
 
 - A Collection can hold any Java object.
    - Collections can NOT hold
        - Primitives 
        - Arrays
        > (They will be retrieved as instances of the Wrapper, but autoboxing still hides that ddetail for the most part) 
 
 * With  the use of `generics` we can specify wht type of objects are being put into the collection
   *  **Type Safety** is assured by the compiler when objects are retrieved from the collection.
   *  If not for generics, java would upcast everything to object, 
        *    forcing us to filter out undesired types,
        *    and downcast desired objects to their original types
