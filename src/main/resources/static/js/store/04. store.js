let slideIndex = 0;

function showSlides() {
    let i;
    const slides = document.getElementsByClassName("banner");

    for (i = 0; i < slides.length; i++) {
       slides[i].style.display = "none";  
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1}    
    
    slides[slideIndex-1].style.display = "block";  

    setTimeout(showSlides, 2000);
}

showSlides();


function dayuk(){
	document.querySelector(".ctp1").addEventListener("click", () => {location.href="/select/dayuk"});
}

dayuk();

