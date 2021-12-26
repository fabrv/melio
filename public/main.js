const openUniversity = (universityId) => {
  window.location.href = `/universidades/${universityId}`;
}

const uniCardKeyDown = (event, universityId) => {
  // Enter and space key
  if (event.keyCode === 13 || event.keyCode === 32) {
    openUniversity(universityId);
  }
}