id = prompt('아이디 입력');
// 원래 var를 쳐야하는데, 그냥 id만 해도 되어서 신기하다.
if (id == 'admin') {
    password = prompt('비밀번호 입력');
    if(password === '123456') {
        location.href = "예제 9-20_login.html"
        // location은 새창을 열지 않고 현재 페이지에서 이동을 하겠다는 뜻.
    }
    else {
        location.href = "예제 9-20_error.html"
    }
}
else {
    location.href = "예제 9-20_error.html"
}