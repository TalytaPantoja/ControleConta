// programa que solicita 3 nomes e 3 notas e calcula a média
let ul = document.querySelector('#tabuada');
const nomes = [];
const notas = [];

for (let i = 0; i < 3; i++) {
  nomes[i] = window.prompt(`Digite o nome do aluno ${i+1}:`);
  notas[i] = parseFloat(window.prompt(`Digite a nota de ${nomes[i]}:`));
  
  // Calcula a contribuição individual (nota/3)
  const contribuicao = notas[i] / 3;
  
  // Cria e exibe o item da lista
  let li = document.createElement('li');
  li.innerText = `${nomes[i]} / ${notas[i]} = ${contribuicao}`;
  ul.appendChild(li);
}

// Adiciona a média total (opcional)
/* const mediaTotal = notas.reduce((sum, nota) => sum + nota, 0) / 3;
let liTotal = document.createElement('li');
liTotal.innerText = `Média final: ${mediaTotal}`;
ul.appendChild(liTotal); */

// console.log("\n--- Resultados ---");
// for (let i = 0; i < 5; i++) {
//   console.log(`${nomes[i]}: ${notas[i].toFixed(1)}`);
// }
// console.log(`\nMédia das notas: ${media.toFixed(1)}`);