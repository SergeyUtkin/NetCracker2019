var x1,x2;
var newElem=document.createElement('table');
newElem.id='tl';
newElem.width=50;
newElem.border=1;
function generate(){
 

document.body.appendChild(newElem);
}

   var newRow=newElem.insertRow(0);
    var newCell = newRow.insertCell(0);
	newCell.innerHTML=0;
    var newCell = newRow.insertCell(1);
	newCell.innerHTML=0;
    var newRow=newElem.insertRow(1);
    var newCell = newRow.insertCell(0);
	newCell.innerHTML=0;
    var newCell = newRow.insertCell(1);
	newCell.innerHTML=0;
	var newRow=newElem.insertRow(1);
    var newCell = newRow.insertCell(0);
	newCell.innerHTML=0;

    var newCell = newRow.insertCell(1);
	newCell.innerHTML=0;
	var newRow=newElem.insertRow(1);
    var newCell = newRow.insertCell(0);
	newCell.innerHTML=0;

    var newCell = newRow.insertCell(1);
	newCell.innerHTML=0;
	var newRow=newElem.insertRow(1);
    var newCell = newRow.insertCell(0);
	newCell.innerHTML=0;
    var newCell = newRow.insertCell(1);
	newCell.innerHTML=0;
	
	var rows = newElem.rows;
for ( var i = 1; i < rows.length; i += 2 )
rows[i].style.backgroundColor="yellow";

function shift()
{
var rows = newElem.getElementsByTagName("tr");
for ( var i = rows.length-1; i >0; i -- )
{
	var cells=newElem.rows[i].cells;
	var tmp=newElem.rows[i-1].cells[0].innerHTML;
	console.log(newElem.rows[i-1].cells[0].value);
	var temp=newElem.rows[i-1].cells[1].innerHTML;
		cells[0].innerHTML=tmp;
		cells[1].innerHTML=temp;
}
}


function roots(a, b, c)
{
	
	if(isNaN(parseInt(a)) || isNaN(parseInt(b)) || isNaN(parseInt(c))){
		
		alert('Не корректные данные!');
	}
	else{
		
	
	if(b*b-4*a*c==0){
	x1=-b/(2*a);
	x2=-b/(2*a);
	}
	if(b*b-4*a*c<0){
		x1="";
	x2="";}
	if(b*b-4*a*c>0){
		x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
	}
		
	console.log(x1 + "  " + x2 );
	
	//table[1,1]=x1;
	//table[1,2]=x2;
	shift();
	console.log();
	var td_cells=newElem.rows[0].cells;
	td_cells[0].innerHTML=x1;
	td_cells[1].innerHTML=x2;
	
	document.getElementById("4").value=x1;
	document.getElementById("5").value=x2;
	var tmp=document.getElementById("t2");
	tmp.rows[0].cells[1].value=x2;
}


}
	
	