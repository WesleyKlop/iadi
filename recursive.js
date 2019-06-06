const faculteit = n => (n <= 1 ? 1 : n * faculteit(n - 1))

console.log(faculteit(3))
console.log(faculteit(5))
console.log(faculteit(1))
console.log(faculteit(0))
