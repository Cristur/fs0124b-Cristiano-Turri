class User {
    constructor(_firstName, _lastName, _age, _location){
        this._firstName = _firstName
        this._lastName = _lastName
        this._age = _age
        this._location = _location
    }
    compareAge(user){
        if(this._age < user._age){
            return `${user._firstName} è più vecchio di ${this._firstName}`
        }
        else if(this._age > user._age){
            return `${this._firstName} è più vecchio di ${user._firstName}`
        }
        else 
        return `${this._firstName} e ${user._firstName} hanno la stessa età`
    }
}

a = new User("Cristiano", "Turri", "25", "Colleferro")
b = new User("Ajeje", "Brazorf", "35", "Napoli")
c = new User("Mario", "Rossi", "25", "Roma")

console.log(a.compareAge(b))
console.log(a.compareAge(c))

