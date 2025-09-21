// 1)
let nome = 'João Pedro'
let idade = 25
let jaAlmocou = true

console.log(typeof nome)
console.log(typeof idade)
console.log(typeof jaAlmocou)

// 2)
let num1 = 10
let num2 = 5

console.log('Soma:', num1 + num2)
console.log('Subtração:', num1 - num2)
console.log('Multiplicação:', num1 * num2)
console.log('Divisão:', num1 / num2)

// 3)
let cidade = 'Barueri'
let estado = 'São Paulos'

console.log('Eu moro em ' + cidade + ', ' + estado + '.')
console.log(`Eu moro em ${cidade}, ${estado}.`)

// 4)
let idade2 = prompt('Qual a sua idade?')

idade2 = Number(idade)

if (idade2 >= 18) {
	alert('Você pode tirar a CNH!')
} else {
	alert('Faltam ' + 18 - idade2 + ' anos para você poder tirar a habilitação.')
}

// 5)
let numero = prompt('Digite um número para ver a tabuada:')
numero = Number(numero)

for (let i = 1; i <= 10; i++) {
	console.log(`${numero} x ${i} = ${numero * i}`)
}

// 6)
let num = 25
let texto = '25'

// Comparação com ==
console.log(num == texto)

// Comparação com ===
console.log(num === texto)

/*
 Explicação:
 - O operador == compara apenas os valores, fazendo conversão de tipos automaticamente (type coercion).
 - Já o operador === compara tanto o valor quanto o tipo.
*/

// 7)
let dia = 3

// Estrutura switch
switch (dia) {
	case 1:
		console.log('Domingo')
		break
	case 2:
		console.log('Segunda-feira')
		break
	case 3:
		console.log('Terça-feira')
		break
	case 4:
		console.log('Quarta-feira')
		break
	case 5:
		console.log('Quinta-feira')
		break
	case 6:
		console.log('Sexta-feira')
		break
	case 7:
		console.log('Sábado')
		break
	default:
		console.log('Número inválido')
}

// 8)
let contador = 10

while (contador > 0) {
	console.log(contador)

	if (contador === 5) break

	contador--
}

// 9)
for (let i = 1; i <= 20; i++) {
	if (i % 2 !== 0) continue

	console.log(`Encontrei um número par: ${i}`)
}

//10
let num10 = Number(prompt('Digite o primeiro número:'))
let num102 = Number(prompt('Digite o segundo número:'))

let operador = prompt('Digite a operação (+, -, *, /):')

let resultado

if (operador === '+') {
	resultado = num10 + num102
	alert('O resultado é: ' + resultado)
} else if (operador === '-') {
	resultado = num10 - num102
	alert('O resultado é: ' + resultado)
} else if (operador === '*') {
	resultado = num10 * num102
	alert('O resultado é: ' + resultado)
} else if (operador === '/') {
	if (num102 === 0) {
		alert('Erro: divisão por zero não é permitida!')
	} else {
		resultado = num10 / num102
		alert('O resultado é: ' + resultado)
	}
} else alert('Operação inválida!')
