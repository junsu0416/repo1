document.addEventListener('DOMContentLoaded', function () {
    // 모달 요소 가져오기
    var updateModal = document.getElementById('update-popup'); // 수정 모달
    var addItemPopup = document.getElementById('add-item-popup'); // 추가 모달
    var stockUpdatePopup = document.getElementById('stock-update-popup'); // 발주 모달

    // 수정 버튼 클릭 이벤트
    document.querySelectorAll('.update-button').forEach(button => {
        button.addEventListener('click', function () {
            // 데이터 설정
            document.getElementById('update-item-id').value = button.getAttribute('data-id');
            document.getElementById('update-item-code').value = button.getAttribute('data-code');
            document.getElementById('update-item-name').value = button.getAttribute('data-name');
            document.getElementById('update-item-stock').value = button.getAttribute('data-count');
            document.getElementById('update-item-location').value = button.getAttribute('data-location');
            document.getElementById('update-item-sort').value = button.getAttribute('data-sort');
            // 모달 열기
            updateModal.style.display = 'block';
        });
    });

    // 발주 버튼 클릭 이벤트
    document.querySelectorAll('.stock-update-button').forEach(button => {
        button.addEventListener('click', function () {
            // 데이터 설정
            document.getElementById('stock-update-item-id').value = button.getAttribute('data-id');
            document.getElementById('order_name').value = button.getAttribute('data-name');
            // 모달 열기
            stockUpdatePopup.style.display = 'block';
        });
    });

    // 모달 닫기 기능
    function closeModal(modal) {
        modal.style.display = 'none';
    }

    document.querySelectorAll('.close').forEach(span => {
        span.onclick = function () {
            closeModal(updateModal);
            closeModal(addItemPopup);
            closeModal(stockUpdatePopup);
        };
    });

    // 창 밖 클릭 시 모달 닫기
    window.onclick = function (event) {
        if (event.target == updateModal) {
            closeModal(updateModal);
        } else if (event.target == addItemPopup) {
            closeModal(addItemPopup);
        } else if (event.target == stockUpdatePopup) {
            closeModal(stockUpdatePopup);
        }
    };
});
