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