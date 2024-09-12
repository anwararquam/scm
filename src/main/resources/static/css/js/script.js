console.log("script loaded");
let currentTheme=getTheme();
document.addEventListener("DOMContentLoaded", () => {
    changeTheme();
})
function changeTheme() {
document.querySelector("html").classList.add(currentTheme);
const changeThemebutton=document.querySelector('#theme_change_button');
changeThemebutton.querySelector("span").textContent=currentTheme=="light"?"Dark":"Light";
changeThemebutton.addEventListener('click',(event)=>{
    const oldTheme=currentTheme;
    console.log("Button clicked for changing theme");
    if(currentTheme=="dark"){
       currentTheme="light";
    }else{
        currentTheme="dark";
    }
setTheme(currentTheme);
    document.querySelector('html').classList.remove(oldTheme);
    document.querySelector('html').classList.add(currentTheme);
    changeThemebutton.querySelector("span").textContent=currentTheme=="light"?"Dark":"Light";
})
};
function setTheme(theme) {
    localStorage.setItem("theme", currentTheme);
};
function getTheme(){
    let theme=localStorage.getItem("theme");
    if(theme){
        return theme
    }else{
        return "light";
    }
}