fetch("http://localhost:3000/api/projects")
  .then(res => res.json())
  .then(data => {
    const list = document.getElementById("project-list");
    data.forEach(project => {
      const div = document.createElement("div");
      div.className = "project";
      div.innerHTML = `
        <h3>${project.title}</h3>
        <p>${project.description}</p>
        <a href="${project.link}" target="_blank">Lihat Proyek</a>
      `;
      list.appendChild(div);
    });
  })
  .catch(err => console.error("Gagal mengambil data:", err));
