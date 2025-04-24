let ul = document.querySelector('#tabuada');
let numero = window.prompt('digite o número para ver a tabuada');

//i = 0
//while(i<=10){
//    let resultado = numero * i;
//    console.log(resultado);
//    exibirNoHTML(numero, i, resultado);
//    i++;
//}

//i = 0
//do {
//    let resultado = numero * i;
//    console.log(resultado);
//    exibirNoHTML(numero, i, resultado);
//    i++;
//} while(i<=10);

for(let i=1;i<=10;i++){
    let resultado = numero * i;
    console.log(resultado);
    exibirNoHTML(numero, i, resultado);
}

function exibirNoHTML(numero, i, resultado){    
    let li = document.createElement('li');
    li.innerText = `${numero} * ${i} = ${resultado}`;
    ul.appendChild(li);
}