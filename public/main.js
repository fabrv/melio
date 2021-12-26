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

let rating = 0;

const stars = document.querySelectorAll('.select-star');
const starMouseEnter = (e) => {
  const id = e.target.id.split('star')[1];

  for (let i = 0; i < stars.length; i++) {
    const starId = stars[i].id.split('star')[1];
    if (starId <= id) {
      stars[i].classList.add('bi-star-fill');
      stars[i].classList.remove('bi-star');
    } else {
      stars[i].classList.add('bi-star');
      stars[i].classList.remove('bi-star-fill');
    }
  }
}

const starMouseLeave = () => {
  for (let i = 0; i < 5; i++) {
    stars[i].classList.remove('bi-star-fill');
    stars[i].classList.add('bi-star');
  }
}

const starClick = (e) => {
  rating = parseInt(e.target.id.split('star')[1]) + 1;
  displayRating(rating);
}

stars.forEach((star) => {
  star.addEventListener('mouseenter', starMouseEnter);
  star.addEventListener('mouseleave', starMouseLeave);
  star.addEventListener('click', starClick);
});

const displayRating = (rating) => {
  const modalStars = document.querySelectorAll('.modal-body .select-star');
  for (let i = 0; i < 5; i++) {
    if (i < rating) {
      modalStars[i].classList.add('bi-star-fill');
      modalStars[i].classList.remove('bi-star');
    } else {
      modalStars[i].classList.add('bi-star');
      modalStars[i].classList.remove('bi-star-fill');
    }
  }
}

var rateModal = document.getElementById('rateModal')
rateModal.addEventListener('show.bs.modal', function (event) {
  var button = event.relatedTarget
  var modalRating = button.getAttribute('data-rating')
  var modalTitle = rateModal.querySelector('.modal-title')

  displayRating(parseInt(modalRating) + 1);
})

