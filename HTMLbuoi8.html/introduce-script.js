const hobby = ["sở thích 1","sở thích 2"];
const hobbylist = document.getElementById("hobbylist");
const ul = document.createElement("ul");
hobby.forEach( hobby => { const li = document.createElement("li");
    li.innerHTML=hobby;
    ul.appendChild(li);
});
hobbylist.appendChild(ul);

const subject = [
     { mon: "Toán", diem: 9, xeploai: "Tốt" },
     { mon: "Lý", diem: 8, xeploai: "Khá" },
     { mon: "Hóa", diem: 7, xeploai: "Khá" },
]
const infortable = document.getElementById("infor-table");
const table = document.createElement("table");
table.border = "1";
table.cellPadding = "10px";
table.cellSpacing ="0";
const headerrow = document.createElement('tr');
["môn học","điểm","xếp loại"].forEach(text=>{
    const th=document.createElement("th");
    th.innerHTML=text;
    th.style.backgroundColor="blue";
    th.style.color="white";
    headerrow.appendChild(th);

});
table.appendChild(headerrow);

subject.forEach(sub=>{
    const row = document.createElement("tr");
    [sub.mon,sub.diem,sub.xeploai].forEach(value=>{
        const td=document.createElement("td");
        td.innerHTML = value;
        row.appendChild(td);

    });
    table.appendChild(row);
});
infortable.appendChild(table);

const skills = [ "kỹ năng 1","kỹ năng 2"];
const skilllist = document.getElementById("skilllist");
const ol = document.createElement("ol");
skills.forEach(
skill=>{
    const li = document.createElement("li");
    li.innerHTML=skill;
    ol.appendChild(li);
 });   
skilllist.appendChild(ol);