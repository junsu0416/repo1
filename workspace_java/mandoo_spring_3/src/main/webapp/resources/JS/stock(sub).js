let products = [
    {
        "품목코드": "M001",
        "품목명": "밀가루",
        "이미지코드": "/image/flour.jpg",
        "재고수량": 500,
        "가용수량": 450,
        "재고위치": "A1창고"
    },
    {
        "품목코드": "M002",
        "품목명": "물",
        "이미지코드": "/image/water.jpg",
        "재고수량": 1000,
        "가용수량": 980,
        "재고위치": "B1창고"
    },
    {
        "품목코드": "M003",
        "품목명": "소금",
        "이미지코드": "/image/salt.webp",
        "재고수량": 300,
        "가용수량": 280,
        "재고위치": "C1창고"
    },
    {
        "품목코드": "M004",
        "품목명": "다진 돼지고기",
        "이미지코드": "/image/mince.jfif",
        "재고수량": 700,
        "가용수량": 690,
        "재고위치": "D1창고"
    },
    {
        "품목코드": "M005",
        "품목명": "다진 양파",
        "이미지코드": "/image/onion.jpg",
        "재고수량": 600,
        "가용수량": 590,
        "재고위치": "L1창고"
    },
    {
        "품목코드": "M006",
        "품목명": "대파",
        "이미지코드": "/image/greenonion.jpg",
        "재고수량": 400,
        "가용수량": 390,
        "재고위치": "P1창고"
    },
    {
        "품목코드": "M007",
        "품목명": "간장",
        "이미지코드": "/image/soysauce.png",
        "재고수량": 800,
        "가용수량": 780,
        "재고위치": "G1창고"
    },
    {
        "품목코드": "M008",
        "품목명": "참기름",
        "이미지코드": "/image/sesameoil.jpg",
        "재고수량": 200,
        "가용수량": 190,
        "재고위치": "P1창고"
    },
    {
        "품목코드": "M009",
        "품목명": "후추",
        "이미지코드": "/image/pepper.jpg",
        "재고수량": 500,
        "가용수량": 490,
        "재고위치": "K1창고"
    },
    {
        "품목코드": "M010",
        "품목명": "마늘",
        "이미지코드": "/image/garlic.jpg",
        "재고수량": 300,
        "가용수량": 290,
        "재고위치": "E1창고"
    },
    {
        "품목코드": "M015",
        "품목명": "김치",
        "이미지코드": "/image/kimchi.webp",
        "재고수량": 100,
        "가용수량": 90,
        "재고위치": "Q1창고"
    }
]

const itemsPerPage = 4;
let currentPage = 1;

function displayTablePage(page) {
    const tableBody = document.getElementById("product-table-body");
    tableBody.innerHTML = "";

    const start = (page - 1) * itemsPerPage;
    const end = start + itemsPerPage;
    const paginatedItems = products.slice(start, end);

    // 자바스크립트로 품목별 내용 표로 가져오기
    paginatedItems.forEach(product => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td style="width:100px">${product.품목코드}</td>
            <td style="width:150px;">${product.품목명}</td>
            <td style="width:100px; height:80px">
                ${product.이미지코드 ? `<img class="imgg" src="${product.이미지코드}" alt="${product.품목명}" style="width: 90px; height: 80px;">` : '이미지가 없습니다'}
            </td>
            <td style="width:100px">${product.재고수량}</td>
            <td style="width:100px">${product.가용수량}</td>
            <td style="width:100px">${product.재고위치}</td>
            <td style="width:100px"><img class="ad1 edit" src="/image/수정.png"></td>
            <td style="width:100px"><img class="ad2 del" src="/image/삭제.png"></td>`;
        tableBody.appendChild(row);
    });
}

// 페이지 버튼을 눌렀을때 페이지가 넘어가고 내용별로(배열)로 끊어서
// 페이지에 들어갈 내용을 알아서 맞춰서 넘어가도록
// 자바스크립트 구성
function setupPagination() {
    const pagination = document.querySelector(".pagination");
    const pageCount = Math.ceil(products.length / itemsPerPage);

    pagination.innerHTML = ""; // 기존 페이지 번호 초기화

    for (let i = 1; i <= pageCount; i++) {
        const span = document.createElement("span");
        span.innerText = i;
        span.addEventListener("click", function () {
            currentPage = i;
            displayTablePage(currentPage);

            const allButtons = pagination.querySelectorAll("span");
            allButtons.forEach(button => {
                button.classList.remove("active");
            });

            span.classList.add("active");
        });
        pagination.appendChild(span);
    }
}

// 상품 추가 함수
document.getElementById("add-item").addEventListener("click", function () {
    const code = document.getElementById("item-code").value;
    const name = document.getElementById("item-name").value;
    const image = document.getElementById("item-image").value;
    const stock = parseInt(document.getElementById("item-stock").value);
    const available = parseInt(document.getElementById("item-available").value);

    // 입력값 검증
    if (!code || !name || !image || isNaN(stock) || isNaN(available)) {
        alert("모든 필드를 올바르게 입력해주세요.");
        return;
    }

    // 새로운 품목 객체 생성
    const newProduct = {
        "품목코드": code,
        "품목명": name,
        "이미지코드": image,
        "재고수량": stock,
        "가용수량": available
    };

    // 제품 배열에 추가
    products.push(newProduct);

    // 테이블과 페이지네이션 업데이트
    setupPagination();
    displayTablePage(currentPage);

    // 입력 필드 초기화
    document.getElementById("item-code").value = "";
    document.getElementById("item-name").value = "";
    document.getElementById("item-image").value = "";
    document.getElementById("item-stock").value = "";
    document.getElementById("item-available").value = "";
});

// 삭제 버튼 클릭 이벤트 처리
document.body.addEventListener("click", function (event) {
    if (event.target.classList.contains("del")) {
        const row = event.target.closest("tr");
        if (row) {
            // 사용자에게 삭제 확인 메시지 표시
            const confirmDelete = confirm("정말 삭제하시겠습니까?");
            if (confirmDelete) {
                row.remove(); // 확인 시 행 삭제
            }
        }
    }
});

// 수정 버튼 클릭 이벤트 처리
document.body.addEventListener("click", function (event) {
    if (event.target.classList.contains("edit")) {
        const row = event.target.closest("tr");
        if (row) {
            const cells = row.querySelectorAll("td");
            cells.forEach((cell, index) => {
                // 이미지 셀(세 번째 셀)과 버튼 셀들은 수정 대상에서 제외
                if (index !== 2 && index < 6) {
                    const currentValue = cell.innerText;
                    const input = document.createElement("input");
                    input.type = "text";
                    input.value = currentValue;
                    input.style.width = "90%"; // 입력 필드의 폭을 셀 폭의 90%로 설정
                    cell.innerHTML = "";
                    cell.appendChild(input);
                } else if (index === 2) { // 이미지 셀을 수정할 경우
                    cell.innerHTML = ""; // 기존 내용 삭제
                    const inputFile = document.createElement("input");
                    inputFile.type = "file";
                    inputFile.accept = "image/*"; // 이미지 파일만 선택 가능
                    cell.appendChild(inputFile); // 파일 입력 추가
                }
            });
            event.target.innerHTML = `<img class="ad1 save" src="/image/저장.png">`;
            event.target.classList.remove("edit");
            event.target.classList.add("save");
        }
    } else if (event.target.classList.contains("save")) {
        const row = event.target.closest("tr");
        if (row) {
            const inputs = row.querySelectorAll("td input");
            inputs.forEach((input, index) => {
                const cell = input.parentElement;
                if (input.type === "file") {
                    const file = input.files[0];
                    if (file) {
                        const reader = new FileReader();
                        reader.onload = function (e) {
                            const img = document.createElement("img");
                            img.src = e.target.result;
                            img.style.width = "50px"; // 새로운 이미지 크기 설정
                            img.style.height = "50px";
                            cell.innerHTML = ""; // 기존 내용을 지우고
                            cell.appendChild(img); // 새로운 이미지를 추가
                        };
                        reader.readAsDataURL(file); // 파일을 읽어 Data URL로 변환
                    } else {
                        // 파일이 선택되지 않은 경우 기존 내용을 유지
                        const existingImg = cell.querySelector("img");
                        if (existingImg) {
                            cell.innerHTML = ""; // 기존 내용을 지우고
                            cell.appendChild(existingImg); // 기존 이미지를 다시 추가
                        }
                    }
                } else {
                    cell.innerText = input.value; // 텍스트 입력 처리
                }
            });
            event.target.innerHTML = `<img class="ad1 edit" src="/image/수정.png">`;
            event.target.classList.remove("save");
            event.target.classList.add("edit");
        }
    }
});



setupPagination();
displayTablePage(currentPage);