const apiKey = 'YOUR_API_KEY'; // Replace with your own API key

const newsContainer = document.querySelector('.news-container');
const appointmentButton = document.querySelector('.appointment');
const doctorAdminButton = document.querySelector('.doctor-admin');
const patientButton = document.querySelector('.patient');
const form = document.querySelector('form');

form.addEventListener('submit', event => {
  event.preventDefault();
  const name = form.name.value;
  const email = form.email.value;
  const message = form.message.value;
  // Code to send form data to server
  form.reset();
});

appointmentButton.addEventListener('click', () => {
  window.location.href = "Contact.html";
});


doctorAdminButton.addEventListener('click', () => {
  // Code to handle "Doctor Admin" button click
});

patientButton.addEventListener('click', () => {
  // Code to handle "Patient Login" button click
});

// Fetch news articles from the News API
fetch(`https://newsapi.org/v2/top-headlines?country=us&apiKey=${apiKey}`)
  .then(response => response.json())
  .then(data => {
    // Loop through each article and create an HTML element to display it
    data.articles.forEach(article => {
      const articleElement = document.createElement('div');
      articleElement.classList.add('news-item');

      const titleElement = document.createElement('h3');
      titleElement.textContent = article.title;
      articleElement.appendChild(titleElement);

      const descriptionElement = document.createElement('p');
      descriptionElement.textContent = article.description;
      articleElement.appendChild(descriptionElement);

      const urlElement = document.createElement('a');
      urlElement.href = article.url;
      urlElement.textContent = 'Read more';
      articleElement.appendChild(urlElement);

      newsContainer.appendChild(articleElement);
    });
  })
  .catch(error => console.log(error));
