var arr=[20,30,12,56,78,39]
var sum=0;
for(var i=0;i<arr.length;i++)
{
    sum=sum+arr[i]
}
console.log(sum)
//sum using reduce method

var total=arr.reduce((sum, marks)=>sum+marks,0)
console.log(total)

//Print even numbers in different array
var scores=[20,13,24,35,76,88]
var evennum=[]
for(var i=0;i<scores.length;i++)
{
    if(scores[i]%2==0)
    {
        evennum.push(scores[i])
    }
}
console.log(evennum)
//using filter function print only even numbers

var evenArray= scores.filter(score=>score%2==0)
console.log(evenArray)

//Map ->  Multiply with number 3 for each value

var mulArray=evenArray.map(score=>score*3)
console.log(mulArray)
//Sum the values
var sumVal=mulArray.reduce((sum, total)=> sum+total,0)
console.log(sumVal)

//Create even array and multiply with 3 for each number them sum the values
var MathScore=[35,40,26,37,28,36,23]
var TotalVal=MathScore.filter(score=>score%2==0).map(evenmarks=>evenmarks*3).reduce((sum, eachValue)=>sum+eachValue,0)
console.log(TotalVal)


var sot=["Raksi","Arun","Bharath","Thimma","Raghu"]
sot.sort()
console.log(sot)

var numsot=[20,30,2,5,35,7]
numsot.sort((a,b)=>a-b);
console.log(numsot)
