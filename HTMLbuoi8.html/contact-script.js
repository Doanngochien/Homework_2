const form = document.getElementById("contactform");
form.addEventListener("submit",function(event){
    event.preventDefault();
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const message = document.getElementById("message").value;
    const gender = document.querySelector('input[name="gender"]:checked')?.value || "chưa chọn";
    const hobby = Array.from(document.querySelectorAll('input[class="hobby"]:checked'))
    .map(el => el.value)
    .join(",")||"không có";
    const city = document.getElementById("city").value;
    console.log("===== THÔNG TIN NGƯỜI DÙNG =====");
    console.log("Họ tên:", name);
    console.log("Email:", email);
    console.log("Liên hệ:", message);
    console.log("Giới tính:", gender);
    console.log("sở thích", hobby);
    console.log("thành phố",city);
    alert(`
    Họ tên: ${name}
    Email: ${email}
    Liên hệ: ${message}
    Giới tính: ${gender}
    Sở thích: ${hobby}
    Thành phố: ${city}
  `);
});
 



