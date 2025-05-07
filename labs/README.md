## 🔁 Lab: Update & Delete Books in Your Book List Web App

### Learning Objectives:

* Add links for editing and deleting items
* Use path variables with Spring controllers
* Pre-fill a form using `@ModelAttribute`
* Use `POST` or `GET` for delete based on simplicity
* (Bonus) Add client-side JavaScript validation

---

## Part 1: Add Edit Book Route

### 1. Add a `GET /books/edit/{index}` route

* In your controller, create a method that:

  * Accepts an `@PathVariable int index`
  * Pulls the book at that index from the list
  * Sends that book to a new view called `book-form.html`

### 2. Update `book-form.html`

* update the book form so it shows the appropriate text for updating or creating
* update the action to send to the proper Post Routing
---

## Part 2: Handle the Book Update

### 1. Add a `POST /books/update` route

* Create a method in your controller to handle the submitted form
* Use `@ModelAttribute` to bind the submitted `Book` and its `index`
* Update the existing book in the list at the given index

---

## Part 3: Add Book Deletion

### 1. Add a `GET /books/delete/{index}` route

* Create a controller method that:

  * Accepts a `@PathVariable int index`
  * Removes the book at that index from the list
  * Redirects back to `/books`

---

## Part 4: Update `book-list.html`

* Add **Edit** and **Delete** links next to each book:


## BONUS: Client-Side Validation

Add custom frontend validation using event listeners to the form as to not use the default behavior and have your own custom error messages for the user `book-form.html`

---

## 🧪 Testing Instructions

* Start your Spring Boot app
* Go to [http://localhost:8080/books](http://localhost:8080/books)
* Test adding a book, editing a book, and deleting a book

---

Would you like a code template for any of these controller methods or forms?
