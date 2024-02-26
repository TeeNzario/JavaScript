let discountButton = document.getElementById('button1');
let discountMessage = document.getElementById('Message');

function alertMessage(){
    discountMessage.innerHTML = 'หมดเเล้วหลวงเห้อ';
}

discountButton.addEventListener('click', alertMessage)
