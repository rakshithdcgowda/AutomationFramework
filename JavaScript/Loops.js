let flag=true
if(flag)
{
    console.log("condition satisfied")
}else{
    console.log("codition not satisfied")
}

while(flag)
{
    console.log(flag)
    flag=false;
}

var marks=[10,20,30,33,45,75]
if(marks.includes(30))
{
    console.log("Number present in the Array")
}

console.log(marks.indexOf(20))
//Push method is used to add the values into array
marks.push(60)
console.log(marks)
//Pop method is used to delete the last value of the array
marks.pop()
console.log(marks)
//Unshift method is used to add the first values into array 
marks.unshift(2)
console.log(marks)

//print array using for loop
for(var  i=0;i<marks.length;i++)
{
   console.log(marks[i])
}