# Applicate-AI-Assignment
Assignment for Applicate IT Solutions

# Before Run the Application, Please follow this steps:

* I can use MySql database for storage, so please run sql_script.sql in MySQL server present in sql_scripts folder.
* After first step, update or change mysql properties in application.properties like url, username and password.
* If you are using postman software , please use json body format. Here are some sample format:
    * For search the name:
        ___http://localhost:8080/api/catalog/get___ 

        ``` 
            {
                "keyword": "ing",
                "supplierName" : "SUPPLIER_A"
            }```

    * For create catalogues:
        Markup :  ___http://localhost:8080/api/catalog/post___

        ` 
            {
                "name": "Bingo 200gm",
                "description": "It contains 200gm snacks which price is Rs 5.00",
                "brandName": "Bingo",
                "brandDescription": "Evening snack time will be fun with the Bingo Salted Potato Chips. Made from golden quality potatoes, these chips are crispy and yummy.",
                "supplier": {
                    "id": "7",
                    "name": "SUPPLIER_C"
                }
            }`

    * For create Supplier:
         Markup :  ___http://localhost:8080/api/supplier/post___

        `
            {
                "name": "SUPPLIER_C"
            }`
