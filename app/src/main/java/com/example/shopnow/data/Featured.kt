package com.example.shopnow.data

class Featured {
    var itemName: String = ""
    var itemPrice: String = ""
    var itemImage: Int = 0

    constructor() {}

    constructor(itemName: String, itemPrice: String, itemImage: Int) {
        this.itemName = itemName
        this.itemPrice = itemPrice
        this.itemImage = itemImage
    }
}