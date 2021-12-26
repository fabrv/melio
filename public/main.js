const openUniversity = (universityId) => {
  window.location.href = `/universidades/${universityId}`;
}

const uniCardKeyDown = (event, universityId) => {
  // Enter and space key
  if (event.keyCode === 13 || event.keyCode === 32) {
    openUniversity(universityId);
  }
}

const toggleClass = (elementId, className) => {
  const element = document.getElementById(elementId);
  element.classList.toggle(className);
}

const removeClass = (elementId, className) => {
  const element = document.getElementById(elementId);
  element.classList.remove(className);
}

const addClass = (elementId, className) => {
  const element = document.getElementById(elementId);
  element.classList.add(className);
}

const stars = document.querySelectorAll('.select-star');
  const starMouseEnter = (e) => {
    const id = e.target.id.replace('star', '');

    for (let i = 0; i < 5; i++) {
      if (i <= id) {
        stars[i].classList.add('bi-star-fill');
        stars[i].classList.remove('bi-star');
      } else {
        stars[i].classList.remove('bi-star-fill');
        stars[i].classList.add('bi-star');
      }
    }
  }

  const starMouseLeave = (e) => {
    for (let i = 0; i < 5; i++) {
      stars[i].classList.remove('bi-star-fill');
      stars[i].classList.add('bi-star');
    }
  }

  stars.forEach((star) => {
    star.addEventListener('mouseenter', starMouseEnter);
    star.addEventListener('mouseleave', starMouseLeave);
  });