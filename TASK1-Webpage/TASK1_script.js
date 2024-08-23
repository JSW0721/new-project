const modal = document.getElementById("modal");
const openModalBtn = document.querySelector(".open-modal-btn");
const closeModalBtn = document.querySelector(".close-btn");

// 모달 열기
openModalBtn.addEventListener("click", function() {
  modal.style.display = "block";
});

// 모달 닫기 (닫기 버튼 클릭 시)
closeModalBtn.addEventListener("click", function() {
  modal.style.display = "none";
});

// 모달 닫기 (모달 바깥쪽 클릭 시)
window.addEventListener("click", function(event) {
  if (event.target === modal) {
    modal.style.display = "none";
  }
});
