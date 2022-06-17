function solution (a) {
    let arr1 = [[1,2], [2,3]];
    let arr2 = [[3,4],[5,6]];
    let answer = [];

    for(i=0; i<arr1.length; i++){
        for(j=0; j<arr1.length; j++) {
            answer.push(arr1[i][j]+arr2[i][j]);
        }
    }
    return answer;
}