const modal = document.getElementById("modal"); //불러올 파라메터 모달 정의
const openModalBtn = document.querySelector(".sub-btn");//모달을 불러올 오픈모달버튼 파라메터 정의
const closeModalBtn = document.querySelector(".modal-close-btn");//모달을 닫을 클로즈모달버튼 파라메터 정의

// 모달 열기
openModalBtn.addEventListener('click', function() {
  modal.style.display = "block";
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
