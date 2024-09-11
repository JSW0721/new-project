const modal = document.getElementById("modal"); //불러올 파라메터 모달 정의
const openModalBtn = document.querySelector(".sub-btn");//모달을 불러올 오픈모달버튼 파라메터 정의
const closeModalBtn = document.querySelector(".modal-close-btn");//모달을 닫을 클로즈모달버튼 파라메터 정의



document.querySelector(".form").addEventListener("submit", function(event) {
  // 이메일 입력 필드 선택 및 공백 제거
  const emailInput = document.getElementById("email").value.trim();

  // 이메일 형식 확인을 위한 정규표현식 (기본적인 형식 검증)
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

  // 빈값인지 확인
  if(emailInput === ""){
    event.preventDefault();
    alert("빈칸으로 두지 마세요.");
  } else if(!emailInput.includes("@")){
    event.preventDefault();
    alert("단순 문자열이 아닌 올바른 이메일 주소를 넣어주세요")
  } // 이메일 형식이 아니면
  else if (!emailPattern.test(emailInput)) {
    event.preventDefault();  // 폼 제출을 막음
    alert("올바른 이메일 주소를 넣어주세요.");  // 경고창 표시
  }
  else {
    event.preventDefault();  // 폼 제출 막고 모달 열기
    modal.style.display = "flex";
  }
});


// 모달 닫기 (닫기 버튼 클릭 시)
closeModalBtn.addEventListener('click', function() {
  modal.style.display = "none";
});

// 모달 닫기 (모달 바깥쪽 클릭 시)
window.addEventListener('click', function(event) {
  if (event.target === modal) {
    modal.style.display = "none";
  }
});

//호버버튼 스크롤
const scrollup = document.getElementById("scrollup");
scrollup.addEventListener("click", function() {
  window.scrollTo({
    top: 0,//가야하는 위치(상단 맨 위로)
    behavior: "smooth"//부드럽게 이동
  });
});

//모바일 버전 메뉴 열고 닫기
function toggleMenu() {
  const menu = document.getElementById('mobile-menu');
  menu.classList.toggle('open');
}
function closeTab() {
  const menu = document.getElementById('mobile-menu');
  menu.classList.remove('open');
}
