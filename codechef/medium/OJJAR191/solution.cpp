  },
  {
    id: 2,
    title: 'Project Two',
    description: 'This project focused on using [Technology] to solve [Problem].',
    link: '#',
  },
];

function Projects() {
  return (
    <section id="projects" className="projects-section">
      <h2>Projects</h2>
      <div className="projects-grid">
        {projectData.map((project) => (
          <div key={project.id} className="project-card">
            <h3>{project.title}</h3>
            <p>{project.description}</p>
            <a href={project.link} target="_blank" rel="noopener noreferrer">
              View Project
            </a>
          </div>
        ))}
      </div>
    </section>
    link: '#',
    id: 1,
    title: 'Project One',
    description: 'A brief description of my first awesome project. It does X, Y, and Z.',
  {
// You can create an array of project data
const projectData = [
